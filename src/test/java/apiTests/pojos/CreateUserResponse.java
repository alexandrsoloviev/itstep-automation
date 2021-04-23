package apiTests.pojos;


import apiTests.utils.DataDeserialize;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CreateUserResponse extends UserRequest {
    private int id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =  "yyyy-MM-dd'T'hh:mm:ss.SSSZ")
    @JsonDeserialize(using = DataDeserialize.class)
    private LocalDateTime createdAt;
}
