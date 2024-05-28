.class public final synthetic Lr/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/m0$a;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lr/m0$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/l0;->n:Lr/m0$a;

    iput-object p2, p0, Lr/l0;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr/l0;->n:Lr/m0$a;

    iget-object v1, p0, Lr/l0;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lr/m0$a;->c(Lr/m0$a;Ljava/lang/String;)V

    return-void
.end method
