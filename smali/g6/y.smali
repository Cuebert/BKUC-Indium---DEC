.class public final synthetic Lg6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lg6/k;


# direct methods
.method public synthetic constructor <init>(Lg6/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/y;->n:Lg6/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg6/y;->n:Lg6/k;

    invoke-virtual {v0}, Lg6/k;->g()V

    return-void
.end method
