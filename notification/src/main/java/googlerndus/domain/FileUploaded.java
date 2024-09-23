package googlerndus.domain;

import googlerndus.domain.*;
import googlerndus.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileSize;
    private String fileType;
    private String uploadStatus;
}
