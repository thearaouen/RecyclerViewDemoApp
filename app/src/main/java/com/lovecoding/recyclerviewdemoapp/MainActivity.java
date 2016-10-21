package com.lovecoding.recyclerviewdemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lovecoding.recyclerviewdemoapp.adapter.DictionaryAdapter;
import com.lovecoding.recyclerviewdemoapp.model.DictionaryItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rcvDictionary = (RecyclerView) findViewById(R.id.rcvDictionary);
        final ArrayList<DictionaryItem> wordList = new ArrayList<>();

        DictionaryItem item = new DictionaryItem("A chromosome", "any chromosome belonging to the normal set characteristic of a given species.");
        wordList.add(item);
        item = new DictionaryItem("a chain", "A polypeptide component of insulin containing 21 amino acids, the composition of which is species-specific.");
        wordList.add(item);
        item = new DictionaryItem("a fiber", "Any of the myelinated nerve fibers in somatic nerves, measuring 1 to 22 microns in diameter, conducting nerve impulses at a rate of 6 to 120 meters per second.");
        wordList.add(item);
        item = new DictionaryItem("A game", "a person’s best effort, abilities, or achievement:\n" +
                "The candidate brought her A game to the debate.\n" +
                "Origin of A game Expand\n" +
                "in reference to a sports contest, with the letter A indicating peak performance");
        wordList.add(item);
        item = new DictionaryItem("A level", "\n" +
                "1.\n" +
                "a public examination requiring advanced knowledge in a subject and taken at the end of secondary school, usually two years after O level.\n" +
                "2.\n" +
                "a pass in this examination.");
        wordList.add(item);
        item = new DictionaryItem("A list", "\n" +
                "1.\n" +
                "a group of desirable or admired people who are welcomed especially in social and professional situations:\n" +
                "Hollywood's A list turned out for the Oscars.\n" +
                "adjective\n" +
                "2.\n" +
                "pertaining to or being in an A list; prominent.");
        wordList.add(item);
        item = new DictionaryItem("little", "adjective, littler or less or lesser, littlest or least.\n" +
                "1.\n" +
                "small in size; not big; not large; tiny:\n" +
                "a little desk in the corner of the room.\n" +
                "2.\n" +
                "short in duration; not extensive; short; brief:\n" +
                "a little while.\n" +
                "3.\n" +
                "small in number:\n" +
                "a little group of scientists.\n" +
                "4.\n" +
                "small in amount or degree; not much:\n" +
                "little hope.\n" +
                "5.\n" +
                "of a certain amount; appreciable (usually preceded by a):\n" +
                "We're having a little difficulty.\n" +
                "6.\n" +
                "being such on a small scale:\n" +
                "little farmers.\n" +
                "7.\n" +
                "younger or youngest:\n" +
                "He's my little brother.");
        wordList.add(item);
        item = new DictionaryItem("bird", "any warm-blooded vertebrate of the class Aves, having a body covered with feathers, forelimbs modified into wings, scaly legs, a beak, and no teeth, and bearing young in a hard-shelled egg.\n" +
                "2.\n" +
                "a fowl or game bird.\n" +
                "3.\n" +
                "Sports.\n" +
                "clay pigeon.\n" +
                "a shuttlecock.\n" +
                "4.\n" +
                "Slang. a person, especially one having some peculiarity:\n" +
                "He's a queer bird.\n" +
                "5.\n" +
                "Informal. an aircraft, spacecraft, or guided missile.\n" +
                "6.\n" +
                "Cookery. a thin piece of meat, poultry, or fish rolled around a stuffing and braised:\n" +
                "veal birds.\n" +
                "7.\n" +
                "Southern U.S. (in hunting) a bobwhite.");
        wordList.add(item);
        item = new DictionaryItem("a little knowledge", "Fruit");
        wordList.add(item);
        item = new DictionaryItem("à la rigueur", "French.\n" +
                "1.\n" +
                "to the fullest extent; literally.\n" +
                "Origin of à la rigueur Expand\n" +
                "literally, in strictness");
        wordList.add(item);
        item = new DictionaryItem("a la plancha", "adjective\n" +
                "1.\n" +
                "(usually postpositive) (in Spanish cookery) grilled on a metal plate\n" +
                "Word Origin\n" +
                "C20: Spanish: on the plate");
        wordList.add(item);
        item = new DictionaryItem("Tea", "Fruit");
        wordList.add(item);
        item = new DictionaryItem("Milkita", "Fruit");
        wordList.add(item);

        DictionaryAdapter adapter = new DictionaryAdapter(wordList);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rcvDictionary.setLayoutManager(manager);
        rcvDictionary.setAdapter(adapter);
        adapter.setHolderOnClickListenner(new ViewHolderOnClickListenner() {
            @Override
            public void onTextClickItem(int position) {
                Intent intent = new Intent(getApplicationContext(), DetailDictionaryActivity.class);
                String word = wordList.get(position).getWord();
                intent.putExtra("word", word.toUpperCase());
                intent.putExtra("difinition", wordList.get(position).getDifinition());
                startActivity(intent);
            }
        });
//        getDetail("My word");
    }
}
