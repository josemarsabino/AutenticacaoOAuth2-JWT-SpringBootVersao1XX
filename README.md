# AutenticacaoOAuth2-JWT-SpringBootVersao1XX

A diferença entre a versão 1XX e 2XX do springboot é que na versão 2XX é necessário tem a classe abaixo para funcionar.

Dentro do pacote config

@Configuration
@EnableWebSecurity

public class OAuthSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	Um token com JWT é diferente de um token tradicioal.
	Exemplo de um token JWT
	
	eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NzM0MjQ0NzgsInVzZXJfbmFtZSI6ImFkbWluIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9ST0xFIl0sImp0aSI6ImE5NDUwMzNhLTgzZDctNDdmZi04ZjNlLWU0NzA1MjhjM2MxZiIsImNsaWVudF9pZCI6ImFuZ3VsYXIiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXX0.U71YxBVT3cRNy3F7CV09myPU26e_1bbZUwfAETrXbto
	 


