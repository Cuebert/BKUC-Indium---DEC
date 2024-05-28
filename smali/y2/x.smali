.class public final synthetic Ly2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ly2/i;

.field public final synthetic o:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Ly2/i;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/x;->n:Ly2/i;

    iput-object p2, p0, Ly2/x;->o:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly2/x;->n:Ly2/i;

    iget-object v1, p0, Ly2/x;->o:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Ly2/i;->q(Landroid/os/IBinder;)V

    return-void
.end method
