package CodeForces.Contest_3;
import java.util.*;
public class IncessantRain {
	
 
	static class Node {
		int key, priority, size, value, best;
		Node left, right;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
			this.priority = new Random().nextInt();
			this.size = 1;
			this.best = value;
		}
	}

	static int size(Node n) {
		return n == null ? 0 : n.size;
	}

	static int best(Node n) {
		return n == null ? Integer.MIN_VALUE : n.best;
	}

	static void update(Node n) {
		if (n == null)
			return;
		n.size = 1 + size(n.left) + size(n.right);
		n.best = Math.max(n.value, Math.max(best(n.left), best(n.right)));
	}

	static Node[] split(Node t, int key) {
		if (t == null)
			return new Node[] { null, null };
		if (key <= t.key) {
			Node[] split = split(t.left, key);
			t.left = split[1];
			update(t);
			return new Node[] { split[0], t };
		} else {
			Node[] split = split(t.right, key);
			t.right = split[0];
			update(t);
			return new Node[] { t, split[1] };
		}
	}

	static Node merge(Node l, Node r) {
		if (l == null)
			return r;
		if (r == null)
			return l;
		if (l.priority > r.priority) {
			l.right = merge(l.right, r);
			update(l);
			return l;
		} else {
			r.left = merge(l, r.left);
			update(r);
			return r;
		}
	}

	static Node insert(Node root, Node node) {
		if (root == null)
			return node;
		if (node.priority > root.priority) {
			Node[] split = split(root, node.key);
			node.left = split[0];
			node.right = split[1];
			update(node);
			return node;
		} else if (node.key < root.key) {
			root.left = insert(root.left, node);
		} else {
			root.right = insert(root.right, node);
		}
		update(root);
		return root;
	}

	static Node erase(Node root, int key) {
		if (root == null)
			return null;
		if (root.key == key) {
			return merge(root.left, root.right);
		} else if (key < root.key) {
			root.left = erase(root.left, key);
		} else {
			root.right = erase(root.right, key);
		}
		update(root);
		return root;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (tests-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			Map<Integer, Node> treaps = new HashMap<>();
			TreeMap<Integer, Integer> multiset = new TreeMap<>();

			for (int i = 0; i < n; i++) {
				int val = a[i];
				Node node = new Node(i, i - 2 * size(treaps.getOrDefault(val, null)));
				Node root = treaps.getOrDefault(val, null);
				root = insert(root, node);
				treaps.put(val, root);
				multiset.put(val, Math.max(multiset.getOrDefault(val, 0), root.best + 1));
			}

			int max = 0;
			for (int v : multiset.values())
				max = Math.max(max, v / 2);
			System.out.println(max);
		}
	}
}
