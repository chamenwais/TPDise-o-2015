package dds.utn.grupo1.objetos

class Usuario {
	def getAltura(){
		1.75
	}
	//En un seter a que le seteas lo que te pasan
	def getPeso(){
		70
	}
	
	def getIMC(){
		getPeso/(getAltura*getAltura)
	}
	
}