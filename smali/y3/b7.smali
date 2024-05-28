.class public final synthetic Ly3/b7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ly3/f7;

.field public final synthetic o:Ly3/y4;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ly3/g7;


# direct methods
.method public synthetic constructor <init>(Ly3/f7;Ly3/g7;Ly3/y4;Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/b7;->n:Ly3/f7;

    iput-object p2, p0, Ly3/b7;->q:Ly3/g7;

    iput-object p3, p0, Ly3/b7;->o:Ly3/y4;

    iput-object p4, p0, Ly3/b7;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ly3/b7;->n:Ly3/f7;

    iget-object v1, p0, Ly3/b7;->q:Ly3/g7;

    iget-object v2, p0, Ly3/b7;->o:Ly3/y4;

    iget-object v3, p0, Ly3/b7;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Ly3/f7;->a(Ly3/g7;Ly3/y4;Ljava/lang/String;)V

    return-void
.end method
