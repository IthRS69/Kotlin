import kotlin.random.Random

class Usuario(
    val id: Int,
    var nomeCompleto: String,
    var email: String,
    var sexo: String,
    var endereco: String,
    var altura: Double,
    var vacina: Int
) {
    override fun toString(): String {
        return "ID: $id, Nome: $nomeCompleto, E-mail: $email, Sexo: $sexo, Endereço: $endereco, Altura: $altura, Vacina: ${if (vacina == 1) "Sim" else "Não"}"
    }
}
fun cadastrarUsuario (listaUsuarios: MutableList<Usuario>) {
    val id = Random.nextInt(1000, 10000)
    println("\nNome completo:")
    val nomeCompleto = readLine()!!
    println("\nE-mail:")
    val email = readLine()!!
    
    println("\nSexo (Feminino/ Masculino/ Indiferente):")
    val sexo = readLine()!!.capitalize()
    
    println("\nEndereço:")
    val endereco = readLine()!!
    println("\nAltura (em metros):")
    val altura = readLine()!!.toDouble()
    
    println("\nVacina (1 para Sim, 0 para Não):")
    val vacina = readLine()!!.toInt()
    
    val novoUsuario = Usuario(id, nomeCompleto, email, sexo, endereco, altura, vacina)
    listaUsuarios.add(novoUsuario)
    println("\nUsuário cadastrado com sucesso!")
}
fun buscarUsuarioPorEmail(listaUsuarios: List<Usuario>, emailBusca: String): Usuario? {
    return listaUsuarios.find { it.email == emailBusca }
}
fun editarUsuario(usuario: Usuario) {
    println("\nEditando usuário:")
    println(usuario)
    
    println("\nNovo Nome:")
    usuario.nomeCompleto = readLine()!!
    
    println("\nNovo Sexo (Feminino/ Masculino/ Indiferente):")
    usuario.sexo = readLine()!!.capitalize()
    
    println("\nNovo Endereço:")
    usuario.endereco = readLine()!!
    
    println("\nNova Altura (em metros):")
    val novaAltura = readLine()!!.toDouble()
    if (novaAltura >= 1.0 && novaAltura <=3.0) {
        usuario.altura = novaAltura
    } else {
        println("\nAltura inválida.")
    }
    println("\nVacina (1 para Sim, 0 para Não):")
    val novaVacina = readLine()!!.toInt()
    if (novaVacina == 0 || novaVacina == 1) {
        usuario.vacina = novaVacina
    } else {
        println("\nOpção de vacina inválida. Escolha 1 para Sim ou 0 para Não.")
    }
    println("\nUsuário editado:")
    println(usuario)
}
fun excluirUsuario(listaUsuarios: MutableList<Usuario>, usuario: Usuario) {
    listaUsuarios.remove(usuario)
    println("\nUsuário excluido com sucesso.")
}
fun main(){
    val listaUsuarios = mutableListOf<Usuario>()
    
    while (true) {
        println("\nSistema de Cadastro de Usuários")
        println("\n1. Cadastrar novo usuário")
        println("\n2. Buscar usuário por e-mail")
        println("\n3. Editar usuário")
        println("\n4. Excluir usuário")
        println("\n5. Mostrar todos os usuários")
        println("\n6. Sair")
        println("\nEscolha uma opção:")
        
        val opcao = readLine()!!.toInt()
        when (opcao) {
            1 -> cadastrarUsuario(listaUsuarios)
            2 -> {
                println("\nDigite o e-mail do usuário a ser buscado:")
                val emailBusca = readLine()!!
                val usuarioEncontrado = buscarUsuarioPorEmail(listaUsuarios, emailBusca)
                if (usuarioEncontrado != null) {
                    println("\nUsuário encontrado:")
                    println(usuarioEncontrado)
                } else {
                    println("\nUsuário não encontrado.")
                }
            }
            3 -> {
                println("\nDigite o e-mail do usuário a ser editado:")
                val emailEdicao = readLine()!!
                val usuarioParaEditar = buscarUsuarioPorEmail(listaUsuarios, emailEdicao)
                if (usuarioParaEditar != null) { editarUsuario(usuarioParaEditar) }
                else {
                    println("\nUsuário não encontrado.")
                }
            }
            4 -> {
                println("\nDigite o e-mail do usuário a ser excluido:")
                val emailExclusao = readLine()!!
                val usuarioParaExcluir = buscarUsuarioPorEmail(listaUsuarios, emailExclusao)
                if (usuarioParaExcluir != null) { excluirUsuario(listaUsuarios, usuarioParaExcluir) }
                else { 
                    println("\nUsuário não encontrado.")
                }
            }
            5 -> {
                println("\nLista de Usuários:")
                if (listaUsuarios.isEmpty()) {
                    println("\nNenhum usuário cadastrado.")
                } else {
                    for (usuario in listaUsuarios) {
                        println(usuario)
                    }
                }
            }
            6 -> {
                println("\nSaindo do programa.")
                return
            }
            else -> {
                println("\nOpção inválida. Por favor, escolha uma opção válida.")
            }
        }
    }
}