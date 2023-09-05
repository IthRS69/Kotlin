fun adicionarTarefa(tasks: MutableList<Pair<String, Boolean>>) {
    print("\nDigite a descrição da tarefa: ")
    val description = readLine() ?: ""
    tasks.add(description to false)
    println("\nTarefa adicionada: $description")
}

fun marcarTarefaConcluida(tasks: MutableList<Pair<String, Boolean>>) {
    print("\nDigite o índice da tarefa a ser marcada como concluída: ")
    val index = readLine()?.toIntOrNull() ?: -1
    if (index in 0 until tasks.size) {
        if (!tasks[index].second) {
            tasks[index] = tasks[index].first to true
            println("\nTarefa marcada como concluída: ${tasks[index].first}")
        } else {
            println("\nEssa tarefa já foi concluída.")
        }
    } else {
        println("\nÍndice inválido.")
    }
}

fun listarTarefasPendentes(tasks: MutableList<Pair<String, Boolean>>) {
    val pendingTasks = tasks.filter { !it.second }
    if (pendingTasks.isEmpty()) {
        println("\nNão há tarefas pendentes.")
    } else {
        println("\nTarefas pendentes:")
        pendingTasks.forEachIndexed { index, task ->
            println("$index. ${task.first}")
        }
    }
}

fun main() {
    val tasks = mutableListOf<Pair<String, Boolean>>()

    while (true) {
        println("\nEscolha uma opção:")
        println("\n1. Adicionar Tarefa")
        println("\n2. Marcar Tarefa como Concluída")
        println("\n3. Listar Tarefas Pendentes")
        println("\n4. Sair")

        when (readLine()?.toIntOrNull()) {
            1 -> adicionarTarefa(tasks)
            2 -> marcarTarefaConcluida(tasks)
            3 -> listarTarefasPendentes(tasks)
            4 -> {
                println("\nPrograma encerrado.")
                return
            }
            else -> println("\nOpção inválida. Escolha novamente.")
        }
    }
}
