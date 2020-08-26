package com.karina.maps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
//https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-assertions-with-assertj/
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
	@DisplayName("Writing assertions for objects")
	class ObjectAssertionTest {
		@Nested
		@DisplayName("When object is not null")
		class WhenObjectIsNotNull{
			@Test
			@DisplayName("Should not be null")
			void shouldNotBeNull(){
				assertThat(new Object()).isNotNull();
			}
		}
		@Nested
		@DisplayName("When two objects are equal")
		class WhenTwoObjectsAreEqual{
			@Nested
			@DisplayName("When objects are intengers")
			class WhenObjectsAreIntengers{
				private final Integer ACTUAL = 9;
				private final Integer EXPECTED = 9;

				@Test
				@DisplayName("Should be equal")
				void shouldBeEqual(){
					assertThat(ACTUAL).isEqualByComparingTo(EXPECTED);
				}
			}
		}
	}


}
