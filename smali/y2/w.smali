.class public final synthetic Ly2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ly2/i;


# direct methods
.method public synthetic constructor <init>(Ly2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/w;->n:Ly2/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly2/w;->n:Ly2/i;

    invoke-virtual {v0}, Ly2/i;->p()V

    return-void
.end method
