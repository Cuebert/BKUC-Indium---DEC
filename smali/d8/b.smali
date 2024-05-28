.class public final synthetic Ld8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ld8/c;


# direct methods
.method public synthetic constructor <init>(Ld8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8/b;->n:Ld8/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ld8/b;->n:Ld8/c;

    invoke-static {v0}, Ld8/c;->d(Ld8/c;)V

    return-void
.end method
