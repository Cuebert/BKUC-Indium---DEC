.class final synthetic Lcom/google/firebase/iid/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/iid/g;


# instance fields
.field private final a:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/z;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/z;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/z;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/iid/z;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()Lg4/l;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/iid/z;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/z;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/z;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/iid/z;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/firebase/iid/FirebaseInstanceId;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lg4/l;

    move-result-object v0

    return-object v0
.end method
