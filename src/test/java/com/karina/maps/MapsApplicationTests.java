package com.karina.maps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

/*Vem por padrão*/
@SpringBootTest
class MapsApplicationTests {
	@Test
	void contextLoads() {
	}
/**/
/*Testa se uma afirmação (assertions) booleana é verdadeira */
	@DisplayName("Escreve assertions para booleans")
	class BooleanAssertionTest{
	@Nested
	@DisplayName("Se boolean é verdadeiro (true)")
	class WhenBooleanIsTrue{
		@Test
		@DisplayName("Deve ser true")
		void shouldBeTrue(){
			assertThat(true).isTrue();
		}
	}
	@Nested
	@DisplayName("Se boolean é falso (false)")
	class WhenBooleanIsFalse{
		@Test
		@DisplayName("Deve ser false")
		void shouldBeFalse(){
			assertThat(false).isFalse();
		}
	}
	}
	//@DisplayName("Writi")
}
