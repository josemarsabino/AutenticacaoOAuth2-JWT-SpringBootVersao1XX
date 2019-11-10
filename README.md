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


