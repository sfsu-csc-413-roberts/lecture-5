package dip;
/**
 * Reproduced from http://www.oodesign.com/dependency-inversion-principle.html
 **/
class Manager {
  IWorker worker;

  public void setWorker( IWorker worker ) {
    this.worker = worker;
  }

  public void manage() {
    worker.work();
  }
}

interface IWorker {
  public void work();
}

class Worker implements IWorker {
  public void work() {}
}

class SuperWorker implements IWorker {
  public void work() {}
}
