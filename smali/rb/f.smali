.class public final synthetic Lrb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lrb/g;


# direct methods
.method public synthetic constructor <init>(Lrb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb/f;->n:Lrb/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lrb/f;->n:Lrb/g;

    invoke-static {v0}, Lrb/g;->a(Lrb/g;)V

    return-void
.end method
