package br.com.josias.apirest.requests;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimePutRequestBody {

	@NotEmpty
	@NotNull
	private Long id;
	@NotEmpty
	@NotNull
	private String name;
}
