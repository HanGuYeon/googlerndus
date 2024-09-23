package googlerndus.domain;

import googlerndus.VideoProcessingApplication;
import googlerndus.domain.VideoStreamed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VideoProcessing_table")
@Data
//<<< DDD / Aggregate Root
public class VideoProcessing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String videoUrl;

    private String fileType;

    @PostPersist
    public void onPostPersist() {
        VideoStreamed videoStreamed = new VideoStreamed(this);
        videoStreamed.publishAfterCommit();
    }

    public static VideoProcessingRepository repository() {
        VideoProcessingRepository videoProcessingRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoProcessingRepository.class
        );
        return videoProcessingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void ifVideoStartStreaming(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        VideoProcessing videoProcessing = new VideoProcessing();
        repository().save(videoProcessing);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoProcessing->{
            
            videoProcessing // do something
            repository().save(videoProcessing);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
