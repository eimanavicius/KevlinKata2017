package net.telesoftas.guts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RecentlyUsedListTest {

    @Test
    public void initialy_list_is_empty() {
        RecentlyUsedList list = new RecentlyUsedList();

        assertTrue(list.isEmpty());
    }

    @Test
    public void can_add_item_to_list() {
        RecentlyUsedList list = new RecentlyUsedList();
        String expectedItem = "first";

        list.add(expectedItem);

        String actualItem = list.get(0);
        assertEquals(expectedItem, actualItem);
    }

    @Test
    public void can_retrieve_item_by_index_starting_from_0() {
        RecentlyUsedList list = new RecentlyUsedList();
        String expectedItem = "first";

        list.add("other 1");
        list.add(expectedItem);
        list.add("other 2");

        String actualItem = list.get(1);
        assertEquals(expectedItem, actualItem);
    }

    @Test
    public void new_added_item_should_be_added_to_begining() {
        RecentlyUsedList list = new RecentlyUsedList();
        String expectedItem = "second";

        list.add("first");
        list.add(expectedItem);

        String actualItem = list.get(0);
        assertEquals(expectedItem, actualItem);
    }

    @Test
    public void last_added_item_should_be_at_the_end() {
        RecentlyUsedList list = new RecentlyUsedList();
        String expectedItem = "first";

        list.add(expectedItem);
        list.add("second");

        String actualItem = list.getLast();
        assertEquals(expectedItem, actualItem);
    }

    @Test
    public void does_not_add_duplicate_items() {
        RecentlyUsedList list = new RecentlyUsedList();
        String expectedItem = "second";

        list.add(expectedItem);
        list.add(expectedItem);

        assertEquals(1, list.getList().size());
    }

    @Test
    public void duplicate_items_moves_to_head() {
        RecentlyUsedList list = new RecentlyUsedList();
        String expectedItem = "second";
        list.add(expectedItem);
        list.add("first");

        list.add(expectedItem);

        assertEquals(expectedItem, list.get(0));
    }

    @Test
    public void list_doesnt_grow_over_capacity() {
        int expectedSize = 1;
        RecentlyUsedList list = new RecentlyUsedList(expectedSize);
        list.add("first");

        list.add("second");

        assertEquals(expectedSize, list.getList().size());

    }

    @Test
    public void when_capacity_reached_last_item_is_removed() {
        RecentlyUsedList list = new RecentlyUsedList(1);
        String expectedItem = "second";
        list.add("first");

        list.add(expectedItem);

        assertEquals(expectedItem, list.get(0));

    }
}
