package liucheuski.siarhei.ai_camp_1.dao.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Customers")
public record Customer(@Id Long chatId, String treadId) {
}
