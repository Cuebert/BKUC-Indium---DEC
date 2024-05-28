.class public Lbacktraceio/library/common/BacktraceSerializeHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static backtraceResultFromJson(Ljava/lang/String;)Lbacktraceio/library/models/BacktraceResult;
    .locals 2

    new-instance v0, Lb6/f;

    invoke-direct {v0}, Lb6/f;-><init>()V

    const-class v1, Lbacktraceio/library/models/BacktraceResult;

    invoke-virtual {v0, p0, v1}, Lb6/f;->j(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/models/BacktraceResult;

    return-object p0
.end method

.method private static buildGson()Lb6/f;
    .locals 2

    new-instance v0, Lb6/g;

    invoke-direct {v0}, Lb6/g;-><init>()V

    sget-object v1, Lb6/d;->r:Lb6/d;

    invoke-virtual {v0, v1}, Lb6/g;->c(Lb6/d;)Lb6/g;

    move-result-object v0

    invoke-virtual {v0}, Lb6/g;->b()Lb6/f;

    move-result-object v0

    return-object v0
.end method

.method public static fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lbacktraceio/library/common/BacktraceSerializeHelper;->buildGson()Lb6/f;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p0, p1}, Lb6/f;->j(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lbacktraceio/library/common/BacktraceSerializeHelper;->buildGson()Lb6/f;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p0}, Lb6/f;->s(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
