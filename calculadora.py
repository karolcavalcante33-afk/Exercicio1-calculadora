import unittest

class Calculadora:
    """Classe responsável por realizar operações matemáticas básicas[cite: 10, 12]."""

    def adicionar(self, a: int, b: int) -> int:
        """Retorna a soma de dois números inteiros."""
        return a + b

    def subtrair(self, a: int, b: int) -> int:
        """Retorna a subtração do segundo número em relação ao primeiro."""
        return a - b

    def multiplicar(self, a: int, b: int) -> int:
        """Retorna o produto de dois números inteiros."""
        return a * b

    def dividir(self, a: int, b: int) -> float:
        """Retorna a divisão do primeiro número pelo segundo.
        Lança um erro se o divisor for zero[cite: 10].
        """
        if b == 0:
            raise ValueError("Erro: Divisão por zero não é permitida[cite: 10].")
        return a / b


# Testes Unitários[cite: 10]
class TestCalculadora(unittest.TestCase):
    def setUp(self):
        self.calc = Calculadora()

    def test_adicionar(self):
        self.assertEqual(self.calc.adicionar(2, 3), 5)

    def test_subtrair(self):
        self.assertEqual(self.calc.subtrair(5, 2), 3)

    def test_multiplicar(self):
        self.assertEqual(self.calc.multiplicar(4, 3), 12)

    def test_dividir(self):
        self.assertEqual(self.calc.dividir(10, 2), 5.0)

    def test_dividir_por_zero(self):
        with self.assertRaises(ValueError):
            self.calc.dividir(10, 0)

if __name__ == "__main__":
    unittest.main()