package id.longquoc.messenger.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "conversation")
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "conversation_name")
    private String conversationName;
    @Column(name = "conversation_type")
    private String conversationType;
    @OneToMany(mappedBy = "conversation")
    private List<Message> messageList;



}
