package app.ticket;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.hasInvitation()) {
            ticketSeller.exchangeToTicket(audience);
        } else {
            ticketSeller.sellTicket(audience);
        }
    }
}
