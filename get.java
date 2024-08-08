try (PrintWriter writer = (new PrintWriter("toys.txt"))){
    for(int i = 0; i < 10; i++){
        Toy toy = totalQueue.poll();
        writer.printf("%d. %s.(%.2f)n", (i+1), toy.getName(), toy.getWeight());
    }
}catch (IOException ex){
    System.err.println("Erroe writing to file:"+ ex.getMessage());
}
