.class public final synthetic Lh2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lh2/v;


# direct methods
.method public synthetic constructor <init>(Lh2/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/u;->n:Lh2/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lh2/u;->n:Lh2/v;

    invoke-static {v0}, Lh2/v;->b(Lh2/v;)V

    return-void
.end method
