.class public final synthetic Ld5/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Ld5/d;


# direct methods
.method public synthetic constructor <init>(Ld5/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/a0;->a:Ld5/d;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Ld5/a0;->a:Ld5/d;

    invoke-static {v0}, Ld5/d;->k(Ld5/d;)V

    return-void
.end method
