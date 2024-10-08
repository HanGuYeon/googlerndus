package googlerndus.domain;

import googlerndus.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileSize;
    private String fileType;
    private String uploadStatus;
}
