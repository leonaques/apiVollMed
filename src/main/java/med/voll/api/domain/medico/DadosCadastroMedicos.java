package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedicos(

        @NotBlank(message = "Nome é obrigatório.")
        String nome,
        @NotBlank(message = "E-mail é obrigatório.")
        @Email (message = "Formato de E-mail inválido.")
        String email,
        @NotBlank (message = "Telefone é obrigatório.")
        String telefone,
        @NotBlank(message = "CRM é obrigatório.")
        @Pattern(regexp = "\\d{4,6}", message = "Formato CRM é inválido.")
        String crm,
        @NotNull (message = "Especialidade é obrigatório.")
        Especialidade especialidade,
        @NotNull (message = "Dados do endereço são obrigatórios.")
        @Valid
        DadosEndereco endereco) {
}
