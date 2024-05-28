.class public final synthetic Lw3/ka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw3/pa;

.field public final synthetic o:Lw3/d8;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lw3/sa;


# direct methods
.method public synthetic constructor <init>(Lw3/pa;Lw3/sa;Lw3/d8;Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/ka;->n:Lw3/pa;

    iput-object p2, p0, Lw3/ka;->q:Lw3/sa;

    iput-object p3, p0, Lw3/ka;->o:Lw3/d8;

    iput-object p4, p0, Lw3/ka;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lw3/ka;->n:Lw3/pa;

    iget-object v1, p0, Lw3/ka;->q:Lw3/sa;

    iget-object v2, p0, Lw3/ka;->o:Lw3/d8;

    iget-object v3, p0, Lw3/ka;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lw3/pa;->c(Lw3/sa;Lw3/d8;Ljava/lang/String;)V

    return-void
.end method
