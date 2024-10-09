package models;

public class GitHubUser {
    private String name;
    private String bio;
    private int public_repos;

    public String getName() {
        return name != null ? name : "Nome não disponível";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio != null ? bio : "Bio não disponível";
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPublicRepos() {
        return public_repos;
    }

    public void setPublicRepos(int public_repos) {
        this.public_repos = public_repos;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\nBio: " + getBio() + "\nRepositórios públicos: " + getPublicRepos();
    }
}
