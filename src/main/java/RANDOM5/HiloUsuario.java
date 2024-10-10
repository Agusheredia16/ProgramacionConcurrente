package RANDOM5;
/*
@author agush
*/
class HiloUsuario implements Runnable {
    private final RecursoCompartido recurso;

    public HiloUsuario(RecursoCompartido recurso) {
        this.recurso = recurso;
    }

    @Override
    public void run() {
        recurso.usarRecurso(Thread.currentThread().getName());
    }
}