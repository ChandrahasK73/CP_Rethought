import socket

# ==== Configuration ====
TARGET_IP = "127.0.0.1"
TARGET_PORT = 1900

INSERT_MESSAGE_TEMPLATE = (
    "0000000116       1nH3KDCn903{}0000    500000000001000004000000912e1-34e3020000000250000000000005110000001500            ||"
)
PART_3 = (
    "||0000000094       1nH3KDCn90500000000000000000000000000000328252013390000000000000000000000000000000000"
    "||0000000042       1nH3KDCn9070003282520133900000000\r\n"
)

BASE_MESSAGE = (
    "000000044600000000000000002000000000700000000000000000910329c83d9891cb84214bfbb7fc898a4e22f     1.9  20000"
    "||0000000056       1nH3KDCn90100328252013390        00000000000000"
    "||0000000116       1nH3KDCn9031000010000    500000000001000004000000912e1-34e3020000000250000000000005110000001500            "
)

# === Helper Functions ===

def generate_insert_messages(sequence_number_start, count):
    """Generate repeated insert message segments."""
    return "".join(
        INSERT_MESSAGE_TEMPLATE.format(str(sequence_number_start + j).zfill(6))
        for j in range(count)
    )

def build_new_message(base_parts, sequence_number, insert_count, initial_length):
    """Build the new message to send."""
    insert_segment = generate_insert_messages(sequence_number, insert_count)
    new_body = base_parts[0] + "||" + base_parts[1] + "||" + insert_segment + base_parts[2] + PART_3

    total_length = initial_length + (126 * insert_count)
    final_message = "{:010d}".format(total_length) + new_body[10:]
    return final_message, total_length

def connect_and_send():
    sock = None
    try:
        sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        sock.connect((TARGET_IP, TARGET_PORT))
        print("🔗 Connected to %s:%d" % (TARGET_IP, TARGET_PORT))

        sequence_number = 100002
        initial_length = 446
        base_parts = BASE_MESSAGE.split("||")

        for i in range(1, 3):  # You can increase the range for more iterations
            print("\n Loop:", i)
            message, initial_length = build_new_message(base_parts, sequence_number, i, initial_length)

            print(" Sending message:\n" + message)
            sock.sendall(message)

            response = sock.recv(1024)
            if response:
                print(" Received response:\n" + response)

            sequence_number += 1  # Increment for next loop

    except socket.error as e:
        print(" Socket error: %s" % e)

    finally:
        if sock:
            sock.close()
            print(" Connection closed.")

# === Main Execution ===

if __name__ == "__main__":
    connect_and_send()
