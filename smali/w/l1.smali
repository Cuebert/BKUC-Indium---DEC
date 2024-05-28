.class public final synthetic Lw/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw/n1;

.field public final synthetic o:Lw/n1$a;

.field public final synthetic p:Lw/n1$a;


# direct methods
.method public synthetic constructor <init>(Lw/n1;Lw/n1$a;Lw/n1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/l1;->n:Lw/n1;

    iput-object p2, p0, Lw/l1;->o:Lw/n1$a;

    iput-object p3, p0, Lw/l1;->p:Lw/n1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw/l1;->n:Lw/n1;

    iget-object v1, p0, Lw/l1;->o:Lw/n1$a;

    iget-object v2, p0, Lw/l1;->p:Lw/n1$a;

    invoke-static {v0, v1, v2}, Lw/n1;->d(Lw/n1;Lw/n1$a;Lw/n1$a;)V

    return-void
.end method
