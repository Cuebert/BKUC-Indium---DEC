.class final synthetic Lcom/google/firebase/messaging/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr5/n;


# instance fields
.field private final a:Lcom/google/firebase/messaging/f;


# direct methods
.method constructor <init>(Lcom/google/firebase/messaging/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/i;->a:Lcom/google/firebase/messaging/f;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)Lg4/l;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/i;->a:Lcom/google/firebase/messaging/f;

    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/f;->zzd(Landroid/content/Intent;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
