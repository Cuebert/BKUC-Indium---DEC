.class public final synthetic Lw/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw/n1$a;

.field public final synthetic o:Lw/n1$b;


# direct methods
.method public synthetic constructor <init>(Lw/n1$a;Lw/n1$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/m1;->n:Lw/n1$a;

    iput-object p2, p0, Lw/m1;->o:Lw/n1$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw/m1;->n:Lw/n1$a;

    iget-object v1, p0, Lw/m1;->o:Lw/n1$b;

    invoke-static {v0, v1}, Lw/n1$a;->b(Lw/n1$a;Lw/n1$b;)V

    return-void
.end method
