package services;

import com.google.gson.Gson;
import exceptions.ErroConsultaGitHubException;
import models.GitHubUser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultaGitHub {

    private static final String GITHUB_API_USER_URL = "https://api.github.com/users/";

    public static String buscarDadosUsuario(String username) throws ErroConsultaGitHubException {
        try {
            URL url = new URL(GITHUB_API_USER_URL + username);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();
            if (status == 404) {
                throw new ErroConsultaGitHubException("Usuário não foi encontrado.");
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            Gson gson = new Gson();
            GitHubUser user = gson.fromJson(content.toString(), GitHubUser.class);

            return user.toString();

        } catch (ErroConsultaGitHubException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
