package be.bstorm.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class PlayerAchivement {

    @EmbeddedId
    private PlayerAchievementId id;

    @ManyToOne
    @MapsId("playerId")
    private Player player;

    @ManyToOne
    @MapsId("achievementId")
    private Achievement achievement;

    private LocalDateTime achievementDate;

    public PlayerAchivement (){
        id = new PlayerAchievementId();
    }

    public PlayerAchivement(Player player, Achievement achievement, LocalDateTime achievementDate) {
        this();
        this.player = player;
        this.achievement = achievement;
        this.achievementDate = achievementDate;
    }

    public PlayerAchievementId getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(Achievement achievement) {
        this.achievement = achievement;
    }

    public LocalDateTime getAchievementDate() {
        return achievementDate;
    }

    public void setAchievementDate(LocalDateTime achievementDate) {
        this.achievementDate = achievementDate;
    }

    @Embeddable
    public static class PlayerAchievementId {
        private Long playerId;
        private Long achievementId;

        public  PlayerAchievementId() {}

        public PlayerAchievementId(Long playerId, Long achievementId) {
            this.playerId = playerId;
            this.achievementId = achievementId;
        }

        public Long getPlayerId() {
            return playerId;
        }

        public void setPlayerId(Long playerId) {
            this.playerId = playerId;
        }

        public Long getAchievementId() {
            return achievementId;
        }

        public void setAchievementId(Long achievementId) {
            this.achievementId = achievementId;
        }
    }
}
