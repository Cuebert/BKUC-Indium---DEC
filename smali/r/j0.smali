.class public final synthetic Lr/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr/m0$a;


# direct methods
.method public synthetic constructor <init>(Lr/m0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/j0;->n:Lr/m0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr/j0;->n:Lr/m0$a;

    invoke-static {v0}, Lr/m0$a;->a(Lr/m0$a;)V

    return-void
.end method
