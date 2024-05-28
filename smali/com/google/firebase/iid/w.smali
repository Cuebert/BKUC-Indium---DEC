.class final synthetic Lcom/google/firebase/iid/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/c;


# instance fields
.field private final a:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/w;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/w;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/w;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lg4/l;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/iid/w;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/w;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/w;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->e(Ljava/lang/String;Ljava/lang/String;Lg4/l;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
