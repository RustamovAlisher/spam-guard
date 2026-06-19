package uz.antispam.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bot")
@Getter
@Setter
public class BotProperties {

    //Bootni telegram BotFather bergan tokin
    private String token;

    //Boot ga quyilgan username
    private String username;

    //Commit (discussion) guruh id si - commitlar shu yerda. Spam bu yerda tekshiriladi
    private Long discussionGroupId;

    // log kanal id si -bot o'chirgan spamlar haqida hisobot yozadigan kanal
    private Long logChannelId;

    //Kanal id postlar spam deb hisoblamasligi uchun
    private Long linkedChannelId;

}
