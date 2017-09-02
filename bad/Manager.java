package bad;
/**
 * Reproduced from http://www.oodesign.com/dependency-inversion-principle.html
 **/
class Manager {
  Worker worker;

  public void setWorker(Worker w) {
    worker = w;
  }

  public void manage() {
    worker.work();
  }
}

class Worker {
  public void work() {}
}

class SuperWorker {
  public void work() {}
}
