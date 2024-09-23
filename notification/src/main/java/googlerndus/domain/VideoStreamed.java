package googlerndus.domain;

import googlerndus.domain.*;
import googlerndus.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private String fileType;
}
