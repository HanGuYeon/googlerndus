package googlerndus.domain;

import googlerndus.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private String fileType;
}
