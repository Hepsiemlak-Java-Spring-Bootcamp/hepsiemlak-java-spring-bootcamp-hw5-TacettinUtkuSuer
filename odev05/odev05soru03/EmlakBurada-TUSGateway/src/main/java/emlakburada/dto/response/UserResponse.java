package emlakburada.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {


	private String name;
	private String email;
	private String photo;
	private String bio;

}
