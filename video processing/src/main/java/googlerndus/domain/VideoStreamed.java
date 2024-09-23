package googlerndus.domain;

import googlerndus.domain.*;
import googlerndus.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private String fileType;

    public VideoStreamed(VideoProcessing aggregate) {
        super(aggregate);
    }

    public VideoStreamed() {
        super();
    }
}
//>>> DDD / Domain Event
