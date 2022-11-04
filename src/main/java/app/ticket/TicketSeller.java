package app.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void exchangeToTicket(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        audience.getBag().setTicket(ticket);
    }

    public void sellTicket(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        audience.getBag().minusAmount(ticket.getFee());
        ticketOffice.plusAmount(ticket.getFee());
        audience.getBag().setTicket(ticket);
    }
}
