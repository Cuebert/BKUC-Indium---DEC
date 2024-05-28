.class public final synthetic Lf7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lf7/w;


# direct methods
.method public synthetic constructor <init>(Lf7/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/p;->n:Lf7/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf7/p;->n:Lf7/w;

    invoke-static {v0}, Lf7/w;->b(Lf7/w;)V

    return-void
.end method
