package org.javamexico.dropDown

class EstadoController {
	def scaffold = true

    def getEstados = { 
	// Obtener el pais
	def paisInstance = Pais.get(params.id)
	// Lista de estados
	def estadosList = paisInstance?.estados
	// Hacer el render del template '_selectEstados.gsp' con la lista de estados obtenidos
	render(template: "selectEstados", model: [estadosList:estadosList])
}
}
