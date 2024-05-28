.class public Lcom/google/firebase/installations/c;
.super Lh5/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/installations/c$a;
    }
.end annotation


# instance fields
.field private final n:Lcom/google/firebase/installations/c$a;


# direct methods
.method public constructor <init>(Lcom/google/firebase/installations/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh5/h;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/firebase/installations/c;->n:Lcom/google/firebase/installations/c$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/installations/c$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lh5/h;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lcom/google/firebase/installations/c;->n:Lcom/google/firebase/installations/c$a;

    return-void
.end method
