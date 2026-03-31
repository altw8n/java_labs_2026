package org.example.chapter02.task15;

import java.util.ArrayList;

public class Network {

    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            this.friends = new ArrayList<>();
        }

        public void deactivate() {
            unenroll(this);
        }

        public void addFriend(Member friend) {
            friends.add(friend);
        }

        public String getName() {
            return name;
        }
    }

    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public void unenroll(Member m) {
        members.remove(m);
    }

    public void printMembers() {
        for (Member m : members) {
            System.out.println(m.getName());
        }
    }
}