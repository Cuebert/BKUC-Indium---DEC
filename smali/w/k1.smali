.class public final synthetic Lw/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw/n1;

.field public final synthetic o:Lw/n1$a;


# direct methods
.method public synthetic constructor <init>(Lw/n1;Lw/n1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/k1;->n:Lw/n1;

    iput-object p2, p0, Lw/k1;->o:Lw/n1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw/k1;->n:Lw/n1;

    iget-object v1, p0, Lw/k1;->o:Lw/n1$a;

    invoke-static {v0, v1}, Lw/n1;->c(Lw/n1;Lw/n1$a;)V

    return-void
.end method
